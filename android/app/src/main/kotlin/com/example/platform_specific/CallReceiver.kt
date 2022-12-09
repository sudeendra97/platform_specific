package com.example.platform_specific

import android.content.Context
import com.example.platform_specific.PhonecallReceiver
import java.util.*

class CallReceiver : PhonecallReceiver() {
    override fun onIncomingCallReceived(ctx: Context?, number: String?, start: Date?) {
        //
    }

    override fun onIncomingCallAnswered(ctx: Context?, number: String?, start: Date?) {
        //
    }

    override fun onIncomingCallEnded(ctx: Context?, number: String?, start: Date?, end: Date?) {
        //
    }

    override fun onOutgoingCallStarted(ctx: Context?, number: String?, start: Date?) {
        //
    }

    override fun onOutgoingCallEnded(ctx: Context?, number: String?, start: Date?, end: Date?) {
        //
    }

    override fun onMissedCall(ctx: Context?, number: String?, start: Date?) {
        //
    }
}