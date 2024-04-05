package com.example.famgithubusernavapp.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.githubuseruiuxapi.model.User
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import cz.msebera.android.httpclient.Header

class HomeViewModel: ViewModel() {
    companion object {
        private val TAG = HomeViewModel::class.java.simpleName
//        private const val GITHUB_API = BuildConfig.GithubAPI
        private const val GITHUB_API = "7e5f26491b034e054fe1cded505a3ebbaa024978"
//        const val GithubAPI = "7e5f26491b034e054fe1cded505a3ebbaa024978"
    }

    private val listUsername = MutableLiveData<ArrayList<User>>()
    private lateinit var errorMessage:String
    fun setUsername(username: String, context: Context) {
        val listItem = ArrayList<User>()
        val searchEndpoint = "https://api.github.com/search/users?q=$username"
        val client = AsyncHttpClient()

        client.addHeader("Authorization", "token $GITHUB_API")
        client.addHeader("User-Agent", "request")
        client.get(searchEndpoint, object: AsyncHttpResponseHandler(){
            override fun onSuccess(
                statusCode: Int,
                headers: Array<out Header>?,
                responseBody: ByteArray?
            ) {
                TODO("Not yet implemented")
            }

            override fun onFailure(
                statusCode: Int,
                headers: Array<out Header>?,
                responseBody: ByteArray?,
                error: Throwable?
            ) {
                TODO("Not yet implemented")
            }

        })
    }

    fun getUsername(){

    }
}