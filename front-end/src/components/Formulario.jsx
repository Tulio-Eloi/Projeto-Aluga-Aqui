import './Formulario.css'
import MyButton from './MyButton'

function Formulario(){
    return(
        <>
            
            <div className='dados-carro'>
                <h2>Dados do carro</h2>
                <h4>Modelo:</h4>
                <h4>Marca:</h4>
                <h4>Placa:</h4>
                <h4>Ano:</h4>
                <h4>Cor:</h4>
                <h4>Status:</h4>
            </div>

            <div className='dados-pessoais'>
                <h1>Dados pessoais</h1>
                <input type="text" id="nome" placeholder='Nome completo' />
                <input type="tel" id="telefone" placeholder='Telefone' />
                <input type="email" id="email" placeholder='Email' />
                <input type="text" id="cpf" placeholder='CPF'/>
                <input type="text" id="endereco" placeholder='Endereço'/>
            </div>

            <div className='aluguel'>
                <h1>Informações do aluguel</h1>
                <input type="date" id="data" placeholder='Data inicial' />
                <input type="date" id="data" placeholder='Data Final' />
                <input type="text" id="observacoes" placeholder='Observações' />
                <input type="text" id="valor" value="Valor total: R$" readOnly/>
                
            </div>
            
            <MyButton label='Concluir' onClick={() => alert('Funcionou!')}/>
        </>

    )
}

export default Formulario