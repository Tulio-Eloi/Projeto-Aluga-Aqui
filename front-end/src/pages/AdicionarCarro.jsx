import Navbar from '../components/Navbar'
import Footer from '../components/Footer'
import FormularioAdicionar from '../components/FormularioAdicionar'
import './Home.css'

function AdicionarCarro(){
    return(
        <div className='layout'>
            <Navbar /> 
            <main>
                <FormularioAdicionar/>
            </main>
            <Footer />
        </div>  

    )
}

export default AdicionarCarro