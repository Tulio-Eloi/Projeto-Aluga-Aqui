import React from 'react';
import "./DadosCarro.css"

const EditarCarro = ({ isOpen, onClose }) => {
  if (!isOpen) return null;

  return (
    <div className='overlay'>
      <div className='modal'>
        <h2 className='tituloEditar'>Editar Carro</h2>
            <input type="text" id="modelo" name="modelo" placeholder='Modelo'/>
            <input type="text" id="marca" name="marca" placeholder='Marca'/>
            <input type="text" id="placa" name="placa" placeholder='Placa'/>
            <input type="text" id="ano" name="ano" placeholder='Ano'/>
            <input type="text" id="cor" name="cor" placeholder='Cor'/>
            <input type="text" id="cor" name="cor" placeholder='Valor'/>
            <br />
            <select className="status" name="status">
                <option value="">Selecione o status</option>
                <option value="Disponível">Disponível</option>
                <option value="Indisponível">Indisponível</option>
                <option value="Alugado">Alugado</option>
            </select>

          <div className='actions'>
            <button className='btnCancelarEditar' type="button" onClick={onClose}>Cancelar</button>
            <button className='btnSalvarEditar' type="submit">Salvar</button>
          </div>
      </div>
    </div>
  );
};


export default EditarCarro;
