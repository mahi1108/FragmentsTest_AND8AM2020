package cubex.mahesh.fragmentstest_and8am2020

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.home_fragment.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var v:View = inflater.inflate(R.layout.home_fragment,
            container,false)

        v.clickme.setOnClickListener {
            Toast.makeText(activity, "ClickMe clicked...",
                Toast.LENGTH_LONG).show()
        }
        return v
    }

}