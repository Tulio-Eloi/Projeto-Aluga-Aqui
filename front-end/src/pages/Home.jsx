import './StyleGeral.css'
import React, { useEffect, useState } from 'react';
import { register } from 'swiper/element/bundle'
register();
import 'swiper/css';

import Navbar from '../components/Navbar'
import Footer from '../components/Footer'
import Slider from '../components/Slider';
import Card from '../components/Card';

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
              nome={"Modelo: "+carro.modelo_carros}
              marca={"Marca: "+carro.marca_carros}
              cor={"Cor: "+carro.cor_carros}
              ano={"Ano: "+carro.ano_carros}
              preco={"R$"+carro.valor_carros}
              imagem={carro.imagens_carros}
              status={"Status: "+carro.status_carros}

            />
          ))}
        </section>
      </main>
      <Footer />
    </div>  
  )
}

export default Home;
