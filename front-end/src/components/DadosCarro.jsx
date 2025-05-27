import './DadosCarro.css'

const DadosCarro = ({modelo, marca, placa, ano, cor, status, className='', mostrarBotoes, id}) => {
    return(
        <div className={`dados-carro ${className}`}>
            <h2>Dados do carro</h2>
            <h4>Modelo: {modelo}</h4>
            <h4>Marca: {marca}</h4>
            <h4>Placa: {placa}</h4>
            <h4>Ano: {ano}</h4>
            <h4>Cor: {cor}</h4>
            <h4>Status: {status}</h4>

            {mostrarBotoes && (
                <div>
                    <button className='remover' onClick={handleDelete => alert("Remover")}>Remover</button>
                    <button className='editar' onClick={() => alert("Editar")}>Editar</button>
                </div>
            )}
        </div>
    )

}

export default DadosCarro