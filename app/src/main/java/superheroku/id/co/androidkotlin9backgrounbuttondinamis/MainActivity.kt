package superheroku.id.co.androidkotlin9backgrounbuttondinamis

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button_background : Int = 1;

        var button_change = findViewById(R.id.button_changing) as Button;

        button_change.setOnClickListener {
            if(button_background==2){
                button_change.setBackgroundResource(R.drawable.btn_center_gradient);
                button_background=1;
            } else if(button_background==1){
                button_change.setBackgroundResource(R.drawable.btn_oval_gradient);
                button_background=2;
            }
        }
    }
}
