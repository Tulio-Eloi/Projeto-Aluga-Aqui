import Navbar from '../components/Navbar'
import Footer from '../components/Footer'
import FormularioAdicionar from '../components/FormularioAdicionar'
import './StyleGeral.css'
import MyButton from '../components/MyButton'

function AdicionarCarro(){
    return(
        <div className='layout'>
            <Navbar /> 
            <main>
                <FormularioAdicionar/>
                <MyButton label='Adicionar' onClick={() => alert('Carro adicionado!')}/>
            </main>
            <Footer />
        </div>  

    )
}

export default AdicionarCarro