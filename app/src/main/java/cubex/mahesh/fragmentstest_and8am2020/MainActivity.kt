package cubex.mahesh.fragmentstest_and8am2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fManager = supportFragmentManager
        var fTx = fManager.beginTransaction()
        fTx.add(R.id.frag,HomeFragment())
        fTx.commit()
    }

    fun changeFrag(v:View)
    {
        var fManager = supportFragmentManager
        var fTx = fManager.beginTransaction()
        when(v.id){
            R.id.home -> fTx.replace(R.id.frag,HomeFragment())
            R.id.courses -> fTx.replace(R.id.frag,CoursesFragment())
            R.id.materials -> fTx.replace(R.id.frag,MaterialsFragment())
        }
        fTx.commit()
    }
}
