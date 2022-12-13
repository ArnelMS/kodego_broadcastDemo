package com.kodego.activity.app.broadcastdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class Receiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirPlaneModeEnabled = intent?.getBooleanExtra("State", false) ?:true
        if(isAirPlaneModeEnabled) {
            Toast.makeText(context, "Airplane Mode is Enabled", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context, "Airplane Mode Disabled", Toast.LENGTH_SHORT).show()

        }
    }

}