import './Card.css'
import { useNavigate } from 'react-router-dom';



function Card({ imagem,nome, marca, preco, cor,ano, status }){
    const navigate = useNavigate();
    return(
        <div className="card">
            <img src={imagem} alt='Card'/>
            <h2 className='titulo'>{nome}</h2>
            <p className='titulo'>{marca}</p>
            <p className='ano'>{ano}</p>
            <p className='cor'>{cor}</p>
            <p className='Status'>{status}</p>

            <div className='card-bottom' onClick={() => navigate('/alugar')}>
                <span className="preco">{preco}</span>
                <button className='botao'>Alugar</button>

            </div>
        </div>
    )
}

export default Card