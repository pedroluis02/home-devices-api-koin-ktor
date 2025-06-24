package com.github.pedroluis02.homedevicesapi

import com.github.pedroluis02.homedevicesapi.domain.UserRepository
import com.github.pedroluis02.homedevicesapi.domain.UserService
import com.github.pedroluis02.homedevicesapi.repository.UserRepositoryImpl
import com.github.pedroluis02.homedevicesapi.service.UserServiceImpl
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val serviceModule = module {
    singleOf(::UserServiceImpl) {
        bind<UserService>()
    }
}

val repositoryModule = module {
    singleOf(::UserRepositoryImpl) {
        bind<UserRepository>()
    }
}
