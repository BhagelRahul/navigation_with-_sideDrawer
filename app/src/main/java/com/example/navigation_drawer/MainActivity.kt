package com.example.navigation_drawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.enableEdgeToEdge

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.navigation_drawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar.toolbar)

        toggle = ActionBarDrawerToggle(
            this,
            binding.drawerlayout,
            binding.toolbar.toolbar,
            R.string.OpenNavigation,
            R.string.CloseNavigation
        )
        binding.drawerlayout.addDrawerListener(toggle)

        val headerView: View = binding.navigationView.getHeaderView(0)
        val cancelButton = headerView.findViewById<View>(R.id.cancelDrawer)

        // Set an OnClickListener on the Cancel button to close the drawer
        cancelButton.setOnClickListener {
            // Close the drawer
            binding.drawerlayout.closeDrawer(GravityCompat.START)
        }

        toggle.syncState()
        binding.navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.optHome -> {
                    replaceFragment(Home_Fragment())
                }

                R.id.optContacts -> {
                    replaceFragment(Contact_Fragment())
                }

                R.id.optMessage -> {
                    replaceFragment(Message_Fragment())
                }

            }
            binding.drawerlayout.closeDrawers()
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack(null)
            .commit()
    }

}





