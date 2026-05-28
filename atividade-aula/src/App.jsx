import './App.css'
import Header from './components/Header'
import Footer from './components/Footer'

function App() {
  return (
    <>
      <Header />
      
      {/* O conteúdo principal do seu mercadinho (rotas, produtos, etc.) entrará aqui */}
      <main style={{ minHeight: 'calc(100vh - 200px)', padding: '20px' }}>
        {/* Conteúdo da página */}
      </main>
      
      <Footer />
    </>
  )
}

export default App