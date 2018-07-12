package com.androidhuman.example.simplegithub.ui.search

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.androidhuman.example.simplegithub.data.remote.GithubApi
import com.androidhuman.example.simplegithub.data.local.SearchHistoryDao

class SearchViewModelFactory(
        private val api: GithubApi,
        private val searchHistoryDao: SearchHistoryDao)
    : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        return SearchViewModel(api, searchHistoryDao) as T
    }
}
