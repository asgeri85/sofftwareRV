package net.asgeri.atlrv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.asgeri.atlrv.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nameAdapter = NameAdapter()

        val list =
            arrayListOf(
                User("Ahmet", R.drawable.adam1),
                User("Mehmet", R.drawable.adam2),
                User("Fatma", R.drawable.adam3), User("Murad", R.drawable.adam4)
            )

        nameAdapter.updateList(list)


        binding.rvHome.adapter = nameAdapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}