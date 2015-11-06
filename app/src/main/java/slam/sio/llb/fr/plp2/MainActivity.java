package slam.sio.llb.fr.plp2;

import android.app.Activity;
import android.os.Bundle;
import xml.LitXml;
import android.util.Log;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LitXml litXml = new LitXml(this);

        for (String ligne : litXml.donneServices())
            Log.i("litxml", ligne);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
