import './Formulario.css'

function FormularioAdicionar(){
    return(
        <>
            <div className='dados-pessoais'>
                <h1>Adicionar carro</h1>
                <input type="text" id="Modelo" placeholder='Modelo'/>
                <input type="text" id="Marca" placeholder='Marca'/>
                <input type="text" id="Placa" placeholder='Placa'/>
                <input type="text" id="Ano" placeholder='Ano'/>
                <input type="text" id="Cor" placeholder='Cor'/>
                <input type="text" id="Status" placeholder='Status'/>
            </div>
                
            <button type="submit">Adicionar</button>
        </>

    )
}

export default FormularioAdicionar