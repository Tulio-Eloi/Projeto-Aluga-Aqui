import { useState } from 'react'
import './Home.css'

import { register } from 'swiper/element/bundle'
register();
import 'swiper/css';

import Navbar from '../components/Navbar'
import Footer from '../components/Footer'
import Slider from '../components/Slider';
import Card from '../components/Card';
import '../assets/carro.png'

// SIMULAÇÃO DE DADOS ABAIXO, SOMENTE ENQUANTO NÃO LIGA COM O BANCO
const carros = [{
    id: 1,
    nome: 'Renault Boreal',
    descricao: 'Econômico, confortável e ótimo para cidade.',
    preco: 149.99,
    imagem: '../assets/carro.png',
  },
  {
    id: 2,
    nome: 'Renault Boreal',
    descricao: 'Econômico, confortável e ótimo para cidade.',
    preco: 149.99,
    imagem: '../assets/carro.png',
  },
  {
    id: 3,
    nome: 'Renault Boreal',
    descricao: 'Econômico, confortável e ótimo para cidade.',
    preco: 149.99,
    imagem: '../assets/carro.png',
  },
  {
    id: 4,
    nome: 'Renault Boreal',
    descricao: 'Econômico, confortável e ótimo para cidade.',
    preco: 149.99,
    imagem: '../assets/carro.png',
  },
  {
    id: 5,
    nome: 'Renault Boreal',
    descricao: 'Econômico, confortável e ótimo para cidade.',
    preco: 149.99,
    imagem: '../assets/carro.png',
  },
  {
    id: 6,
    nome: 'Renault Boreal',
    descricao: 'Econômico, confortável e ótimo para cidade.',
    preco: 149.99,
    imagem: '../assets/carro.png',
  },
  {
    id: 7,
    nome: 'Renault Boreal',
    descricao: 'Econômico, confortável e ótimo para cidade.',
    preco: 149.99,
    imagem: '../assets/carro.png',
  },
  

]

function Home() {
  return (
    <div className='layout'>
      <Navbar /> 
      <main>
        <Slider></Slider>
        <section className='card-list'>
          {carros.map((carro) => (
            <Card
              key={carro.id}
              nome={carro.nome}
              descricao={carro.descricao}
              preco={carro.preco}
              imagem={carro.imagem}
            />
          ))}
        </section>
      </main>
      <Footer />
    </div>  
  )
}

export default Home
