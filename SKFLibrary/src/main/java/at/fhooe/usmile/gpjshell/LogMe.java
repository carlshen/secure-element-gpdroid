package at.fhooe.usmile.gpjshell;

import android.util.Log;

/**
 * Created by dell on 2019/11/15.
 */

public class LogMe {
    public void log(String _tag, String _text) {
        Log.d(_tag, _text);
    }

    public void e(String _tag, String _text) {
        log(_tag, _text);
    }

    public void e(String _tag, String _text, Exception _e) {
        log(_tag, _text + _e.getMessage());
    }

    public void d(String _tag, String _text) {
        log(_tag, _text);
    }

    public void i(String _tag, String _text) {
        log(_tag, _text);
    }
}
