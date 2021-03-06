    package com.conceptiveideas.aayam.expertme;

    import android.app.Fragment;
    import android.app.FragmentTransaction;
    import android.content.SharedPreferences;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.text.Html;
    import android.text.method.LinkMovementMethod;
    import android.widget.TextView;

    import com.conceptiveideas.aayam.expertme.Constants;
    import com.conceptiveideas.aayam.expertme.LoginFragment;
    import com.conceptiveideas.aayam.expertme.ProfileFragment;
    import com.conceptiveideas.aayam.expertme.R;

    public class MainActivity extends AppCompatActivity {

        private SharedPreferences pref;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            pref = getPreferences(0);
            initFragment();
            TextView Link = (TextView) findViewById(R.id.textView4);
            Link.setText(Html.fromHtml(
                    "Made By <a href=\"http://conceptiveideas.com\">Conceptive Ideas</a>"));
            Link.setMovementMethod(LinkMovementMethod.getInstance());
        }

        private void initFragment(){
            Fragment fragment;
            if(pref.getBoolean(Constants.IS_LOGGED_IN,false)){
                fragment = new ProfileFragment();
            }else {
                fragment = new LoginFragment();
            }
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_frame,fragment);
            ft.commit();
        }

    }