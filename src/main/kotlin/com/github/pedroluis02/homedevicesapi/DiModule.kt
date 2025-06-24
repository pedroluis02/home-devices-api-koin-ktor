package com.github.pedroluis02.homedevicesapi

import com.github.pedroluis02.homedevicesapi.domain.UserRepository
import com.github.pedroluis02.homedevicesapi.domain.UserService
import com.github.pedroluis02.homedevicesapi.repository.UserRepositoryImpl
import com.github.pedroluis02.homedevicesapi.service.UserServiceImpl
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import org.koin.ksp.generated.module

@Module
@ComponentScan
class DeviceModule

val repositoryModule = module {
    UserRepositoryImpl::class.java.`package`
    singleOf(::UserRepositoryImpl) {
        bind<UserRepository>()
    }
}

val serviceModule = module {
    singleOf(::UserServiceImpl) {
        bind<UserService>()
    }
}

val appModule = module {
    includes(DeviceModule().module, repositoryModule, serviceModule)
}
