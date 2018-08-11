package br.com.fiap.pokedex

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import br.com.fiap.pokedex.model.Pokemon

import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val pokemon = intent.extras.getParcelable<Pokemon>("Pokemon")
        Toast.makeText(this,pokemon.nome, Toast.LENGTH_LONG).show()

}
