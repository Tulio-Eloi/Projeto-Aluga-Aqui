import './Card.css'
import imagem from '../assets/carro.png'

function Card({ nome, descricao, preco }){
    return(
        <div className="card">
            <img src={imagem} alt='Card'/>
            <h2 className='titulo'>{nome}</h2>
            <p className='descricao'>{descricao}</p>
            <div className='card-bottom'>
                <span className="preco">{preco}</span>
                <button className='botao'>Alugar</button>

            </div>
        </div>
    )
}

export default Card