package com.task.dindinn.main.di

import com.task.dindinn.main.data.MainRemoteDS
import com.task.dindinn.main.domain.MainRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit

@Module
@InstallIn(ActivityComponent::class)
class MainModule {
    @Provides
    fun provideMainRemoteDS(retrofit: Retrofit): MainRemoteDS =
        retrofit.create(MainRemoteDS::class.java)

    @Provides
    fun providesMainRepo(mainRemoteDS: MainRemoteDS) =MainRepo(mainRemoteDS)
}