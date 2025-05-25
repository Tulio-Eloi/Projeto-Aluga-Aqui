const DadosCarro = ({modelo, marca, placa, ano, cor, status}) => {
    return(
        <div className='dados-carro'>
            <h2>Dados do carro</h2>
            <h4>Modelo: {modelo}</h4>
            <h4>Marca: {marca}</h4>
            <h4>Placa: {placa}</h4>
            <h4>Ano: {ano}</h4>
            <h4>Cor: {cor}</h4>
            <h4>Status: {status}</h4>
        </div>
    )

}

export default DadosCarro