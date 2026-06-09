import { Route, Routes } from 'react-router-dom'
import './App.css'
import Footer from './components/Footer'
import Header from './components/Header'
import Home from './pages/Home'
import SobreNos from './pages/SobreNos'
import Produtos from './pages/Produtos'

function App() {

  return (
    <>
    <Header />
    <main>
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/sobre-nos' element={<SobreNos />} />
        <Route path='/produtos' element={<Produtos />} />
      </Routes>
    </main>
    <Footer />
    </>
  )
}

export default App
