package com.example.myageassignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    /* name of celebrities that have passed on. this array links to the ages below.*/
    private var infOfDeadPeople = arrayOf(
        "Cameron Boyce, A Disney star who was well-known for staring in projects like Jessie, Descendants and Juby Moody the Bummer  Summer. He passed away due to a Epileptic seizure.",
        "Glen Quinn, An Irish Actor that appeared on numerous projects in the 90s. He passed away due to drug overdose in late 2002.",
        "Virgil Abloh, famed fashion designer and Louis Vuitton artistic director. Passed away due to a rare cancer he'd been battling in private for several years.",
        "Kirshnik Khari Ball aka Takeoff, was murdered in a fatal shooting in Texas in late 2022.",
        "Chadwick Boseman, he was a in Marvels Black Panther. He passed away in 2020 due to colon cancer.",
        "Aaliyah,Groundbreaking R&B singer. An airplane crashed in the Bahamas and killed 9 other passengers.",
        "Luke Perry, Beverly Hills actor. unexpectedly died due to a stroke.",
        "Frederik Willem de Klerk, He was a South African politician. He due to Mestheliom.",
        "Pablo Escobar, He was a Colombian drug lord, narcoterrorist and politician. He was the founder and sole leader of the Medellin Cartel.",
        "Theodore Roosevelt, the 26th president os the United states. he died in his sleep.",
        /* (Ballhau L, 2023)
        * https://www.sheknows.com
        * Module Manual IMAD page 79*/
    )

    /* the ages of when the celebrities passed on. linked to the array above. Module Manual IMAD page 79 */
    private var ages = arrayOf(
        20,
        32,
        41,
        28,
        43,
        22,
        53,
        85,
        44,
        61,

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* declaration of buttons Module Manual IMAD page  67*/
        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)


        /* declaration of the EditText and TextView  module manual IMAD page 67*/
        val txtAge = findViewById<EditText>(R.id.txtAge)
        val txtHistory = findViewById<TextView>(R.id.txtHistory)

        /* Generate Button Instructions, this is what the Button is supposed to do. module manual IMAD page 45 */
        btnGenerate.setOnClickListener {
            val enteredAge = txtAge.text.toString().toIntOrNull()
            if (enteredAge in 20..100) /* check if the age range is between 20 and 100 */
            if(enteredAge != null) {
                val index = ages.indexOf(enteredAge)
                if (index != -1 && index < infOfDeadPeople.size) {
                    val name = infOfDeadPeople[index]
                    txtHistory.text ="The person who died at the age $enteredAge, is $name."

                } else {
                    txtHistory.text = "No person died at the age of $enteredAge."
                }
            }

            /* Error Handling, if unknown value is entered you will have to enter a valid value. */
            else {
                txtHistory.text = "The age you've entered is invalid, Please enter ages between 20 and 100!!!"
            }
        }

       /* Clear Button Instructions, instructed to clear any text that hase been entered. Module manual IMAD page 45 */
        btnClear.setOnClickListener {
            txtAge.text.clear()
            txtHistory.text = ""
        }
        }


}


