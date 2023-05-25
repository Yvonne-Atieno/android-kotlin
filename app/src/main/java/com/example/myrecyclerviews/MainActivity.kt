
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    class MainActivity : AppCompatActivity() {
        lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
        }
        override fun onResume() {
            super.onResume()
            fibonacciNumbers()
        }
        fun fibonacciNumbers():List<Int>{
            var numbers = mutableListOf<Int>()
            numbers.add(0)
            numbers.add(1)
            for (i in 2 until 101){
                numbers.add(numbers[i-1] + numbers[i-2 ])
            }
            binding.rvNumbers.layoutManager = LinearLayoutManager(this,)
            val namesAdapter = NumbersRvAdapter(numbers)
            binding.rvNumbers.adapter = namesAdapter
            return numbers
        }
    }






}



