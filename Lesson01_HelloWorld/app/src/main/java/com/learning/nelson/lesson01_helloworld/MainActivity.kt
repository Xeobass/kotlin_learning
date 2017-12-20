package com.learning.nelson.lesson01_helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message.text = "Hello Kotlin!"

        /*
        * What i did?
        *
        * Added the Anko lib to get more powerfull features (check build.grade to see how)
        * Added the main string to strings.xml file (check app/values/strings.xml)
        * Created a TextView component and set id 'message' (now...the size is not a problem)
        * with Kotlin, I access directly to the component just type the id ('message')
        * and set a text with the 'text' property =)
        *
        * Kotlin give us the power to access to the view without looking for it (findElementById()...R.Id.bla bla bla)
        * or using others third party libs. All comes with Kotlin!
        *
        *
        * */

    }

}
