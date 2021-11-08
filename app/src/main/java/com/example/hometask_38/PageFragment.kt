package com.example.hometask_38

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_page.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class PageFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null
    var page: Page? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_page, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        ivPicture.setImageBitmap(page?.image)
        ivmath.setImageBitmap(page?.imagemath)
        tvMain.text = page?.title
        tvNumber.text = page?.text


    }


    companion object {
        @JvmStatic
        fun newInstance(page: Page) =
            PageFragment().apply {
                /*arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }*/
         this.page = page

            }
    }
}