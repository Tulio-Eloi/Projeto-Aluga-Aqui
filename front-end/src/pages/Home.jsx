import './Home.css'
import React, { useEffect, useState } from 'react';
import { register } from 'swiper/element/bundle'
register();
import 'swiper/css';

import Navbar from '../components/Navbar'
import Footer from '../components/Footer'
import Slider from '../components/Slider';
import Card from '../components/Card';
import '../assets/carro.png'

// SIMULAÇÃO DE DADOS ABAIXO, SOMENTE ENQUANTO NÃO LIGA COM O BANCO
/*const carros = [{
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
  

]*/


function Home() {

  const [carros, setCarros] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/carros') // URL do seu back-end
      .then(response => response.json())
      .then(data => setCarros(data))
      .catch(error => {
        console.error("Erro ao buscar carros:", error);
      });
  }, []);

  return (
    <div className='layout'>
      <Navbar /> 
      <main>
        <Slider></Slider>
        <section className='card-list'>
          {carros.map((carro) => (
            <Card
              key={carro.id_carros}
              nome={carro.modelo_carros}
              descricao={carro.marca_carros}
              preco={carro.valor_carros}
              imagem={carro.imagens_carros}
            />
          ))}
        </section>
      </main>
      <Footer />
    </div>  
  )
}

export default Home;
