package octa.web.login1203manu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import octa.web.login1203manu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFechar.setOnClickListener{
            finishAffinity()
        }
    }
}