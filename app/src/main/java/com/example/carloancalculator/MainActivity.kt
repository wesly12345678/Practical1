package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){

            val carPrice:Double = txtCarPrice.text.toString().toDouble()
            val downPayment:Double = txtDownPayment.text.toString().toDouble()
            val interestRate:Double = txtInterestRate.text.toString().toDouble()
            val loanPeriod:Double = txtLoanPeriod.text.toString().toDouble()

            val carLoan:Double = carPrice - downPayment
            val interest:Double = carLoan * interestRate * loanPeriod
            val monthlyRepayment:Double = (carLoan + interest) / loanPeriod / 12

            lblCarLoan.text = "Car Loan = RM %.2f".format(carLoan)
            lblInterest.text = "Interest = RM %.2f".format(interest)
            lblMonthlyRepayment.text = "Monthly Repayment RM %.2f".format(monthlyRepayment)

        }



    }
}
