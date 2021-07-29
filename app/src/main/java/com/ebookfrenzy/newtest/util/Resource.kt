package com.ebookfrenzy.newtest.util

import androidx.compose.runtime.snapshots.SnapshotApplyResult

sealed class Resource<out T> {
    data class Success<out T>(val data: T) : Resource<T>()
    data class Error(val failure: SnapshotApplyResult.Failure) : Resource<Nothing>()
    object Loading : Resource<Nothing>()
}