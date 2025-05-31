import React from 'react';

const EditarCarro = ({ isOpen, onClose }) => {
  if (!isOpen) return null;

  return (
    <div style={styles.overlay}>
      <div style={styles.modal}>
        <h2>Editar Carro</h2>
        <form>
          <label>
            Modelo:
            <input type="text" name="modelo" />
          </label>
          <br />
          <label>
            Marca:
            <input type="text" name="marca" />
          </label>
          <br />
          <label>
            Ano:
            <input type="number" name="ano" />
          </label>
          <br />
          <div style={styles.actions}>
            <button type="button" onClick={onClose}>Cancelar</button>
            <button type="submit">Salvar</button>
          </div>
        </form>
      </div>
    </div>
  );
};

const styles = {
  overlay: {
    position: 'fixed', top: 0, left: 0, right: 0, bottom: 0,
    backgroundColor: 'rgba(0,0,0,0.5)', display: 'flex',
    alignItems: 'center', justifyContent: 'center',
    zIndex: 1000
  },
  modal: {
    backgroundColor: 'white', padding: '2rem', borderRadius: '10px',
    boxShadow: '0 2px 10px rgba(0,0,0,0.2)', minWidth: '300px',
  },
  actions: {
    marginTop: '1rem', display: 'flex', justifyContent: 'flex-end', gap: '1rem'
  }
};

export default EditarCarro;
