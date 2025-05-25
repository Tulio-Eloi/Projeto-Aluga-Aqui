import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import { BrowserRouter } from 'react-router-dom';
import './index.css'
import Home from './pages/Home.jsx'
import Alugar from './pages/Alugar'
import AdicionarCarro from './pages/AdicionarCarro.jsx';

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <BrowserRouter>
      <Home />
      {/* < Alugar /> */}
      {/* <AdicionarCarro/> */}
    </BrowserRouter>
  </StrictMode>,
)
