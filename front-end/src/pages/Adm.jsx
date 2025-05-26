import './StyleGeral.css'
import Navbar from '../components/Navbar'
import Footer from '../components/Footer'
import DadosCarro from '../components/DadosCarro'
import '../components/DadosCarro.css'
import MyButton from '../components/MyButton'

// a variável abaixo foi colocada apenas para simular os dados do banco
// favor, apagar ao conectar com o banco
const Adm =()=>{
    const carrosExemplo = [
    {
      modelo: 'Civic',
      marca: 'Honda',
      placa: 'ABC-1234',
      ano: 2020,
      cor: 'Prata',
      status: 'Disponível',
    },
    {
      modelo: 'Corolla',
      marca: 'Toyota',
      placa: 'DEF-5678',
      ano: 2019,
      cor: 'Preto',
      status: 'Alugado',
    },
    {
      modelo: 'Onix',
      marca: 'Chevrolet',
      placa: 'GHI-9012',
      ano: 2022,
      cor: 'Branco',
      status: 'Manutenção',
    },
  ];


    return(
        <div className='layout'>
            <Navbar/>
            <main>
                <h1 className='adm'>CARROS CADASTRADOS</h1><br />
                <MyButton label='Adicionar carro' onClick={() => alert('Adicionar!')}/>
                {carrosExemplo.map((carro, index) => (
                    <DadosCarro
                    key={index}
                    className="adm" //esse parâmetro não deve ser alterado
                    mostrarBotoes={true} //esse parâmetro nao deve ser alterado
                    modelo={carro.modelo}
                    marca={carro.marca}
                    placa={carro.placa}
                    ano={carro.ano}
                    cor={carro.cor}
                    status={carro.status}
                    />
                ))} 
                <br /><br /><br />
            </main>
            <Footer/>
        </div>

    )
}

export default Adm