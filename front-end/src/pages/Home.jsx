import { useState } from 'react'
import './Home.css'

import { register } from 'swiper/element/bundle'
register();
import 'swiper/css';

import Navbar from '../components/Navbar'
import Footer from '../components/Footer'
import Slider from '../components/Slider';

function Home() {
  return (
    <div className='layout'>
      <Navbar /> 
      <main>
        <Slider></Slider>
      </main>
      <Footer />
    </div>  
  )
}

export default Home
