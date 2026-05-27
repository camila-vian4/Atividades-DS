import './App.css'
import Footer from './components/Footer'
import Header from './components/Header'
import Clientes from './pages/Clientes'

function App() {

  return (
    <>
    <Header />
    <main>
      <Clientes />
    </main>
    <Footer />
    </>
  )
}

export default App