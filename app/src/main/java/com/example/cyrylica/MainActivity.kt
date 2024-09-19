package com.example.cyrylica

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cyrylica.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var question: Question = DefaultMode().getQuestion()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mode.visibility = View.INVISIBLE
        binding.next.visibility = View.INVISIBLE
        generateQuestion()

        binding.a.setOnClickListener {
            showAnswer(binding.a.text.toString())
            binding.next.visibility = View.VISIBLE
        }
        binding.b.setOnClickListener {
            showAnswer(binding.b.text.toString())
            binding.next.visibility = View.VISIBLE
        }
        binding.c.setOnClickListener {
            showAnswer(binding.c.text.toString())
            binding.next.visibility = View.VISIBLE
        }
        binding.d.setOnClickListener {
            showAnswer(binding.d.text.toString())
            binding.next.visibility = View.VISIBLE
        }

        binding.next.setOnClickListener {
            binding.next.visibility = View.INVISIBLE
            generateQuestion()
        }
    }

    fun showAnswer(answer: String?){
        if (binding.a.text == answer)
            binding.a.setBackgroundColor(Color.argb(255, 255, 0, 0))
        if (binding.b.text == answer)
            binding.b.setBackgroundColor(Color.argb(255, 255, 0, 0))
        if (binding.c.text == answer)
            binding.c.setBackgroundColor(Color.argb(255, 255, 0, 0))
        if (binding.d.text == answer)
            binding.d.setBackgroundColor(Color.argb(255, 255, 0, 0))

        if (binding.a.text == question.answer)
            binding.a.setBackgroundColor(Color.argb(255, 0, 255,  0))
        if (binding.b.text == question.answer)
            binding.b.setBackgroundColor(Color.argb(255, 0, 255, 0))
        if (binding.c.text == question.answer)
            binding.c.setBackgroundColor(Color.argb(255, 0, 255, 0))
        if (binding.d.text == question.answer)
            binding.d.setBackgroundColor(Color.argb(255, 0, 255, 0))
    }

    fun generateQuestion(){
        question = DefaultMode().getQuestion()
        binding.question.text = question.question
        when(Random.nextInt(1..4)){
            1->{
                binding.a.text = question.firstWrongAnswer
                binding.b.text = question.secondWrongAnswer
                binding.c.text = question.thirdWrongAnswer
                binding.d.text = question.answer
            }
            2->{
                binding.a.text = question.firstWrongAnswer
                binding.b.text = question.secondWrongAnswer
                binding.d.text = question.thirdWrongAnswer
                binding.c.text = question.answer
            }
            3->{
                binding.a.text = question.firstWrongAnswer
                binding.c.text = question.secondWrongAnswer
                binding.d.text = question.thirdWrongAnswer
                binding.b.text = question.answer
            }
            4->{
                binding.b.text = question.firstWrongAnswer
                binding.c.text = question.secondWrongAnswer
                binding.d.text = question.thirdWrongAnswer
                binding.a.text = question.answer
            }
        }
        binding.a.setBackgroundColor(Color.argb(255, 100, 100, 200))
        binding.b.setBackgroundColor(Color.argb(255, 100, 100, 200))
        binding.c.setBackgroundColor(Color.argb(255, 100, 100, 200))
        binding.d.setBackgroundColor(Color.argb(255, 100, 100, 200))
    }
}