package br.com.fiap.calcularsalario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnCalcular.setOnClickListener {
           //variaveis
           var nomeFuncionario = txtNomeFuncionario.text.toString()
           var valorHoraTrabalhado = txtValorHoraTrabalhada.text.toString().toFloat()
           var  qtdDiasTrabalhados = txtDiasTrabalhados.text.toString().toFloat()
           var qtdHorasDias = txtHorasDias.text.toString().toFloat()

           //variaveis descontos
           var  inss = 0.05
           var fgts = 0.08

           //calculando para saber salario bruto
           var salariobruto = qtdHorasDias * qtdDiasTrabalhados * valorHoraTrabalhado

           //calculo para saber o valor do desconto inss
           var  descInss = salariobruto * inss

           //calculo para saber o valor do desconto do fgts
           val descFGTS = salariobruto * fgts

            //salario final
           val salarioLiquido = salariobruto - (descFGTS + descInss)

           //valor que sera exibido na tela
           lblSalarioBruto.text = "Salário Bruto: ${salariobruto}"
           lblDescInss.text = "Desc. INSS: ${descInss}"
           lblDescfgts.text = "desc. fgts: ${descFGTS}"
           salariofinal.text = "salario liquido: ${salarioLiquido}"
       }
    }
}