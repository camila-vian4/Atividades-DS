import { useState, useEffect } from 'react';
import './style.css'
import api from '../../services/api';
import toast from 'react-toastify';
import { useEffect } from 'react';

export default function ListaPage() {
  const [users, setUsers] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
      const fetchUsuarios = async () => {
          try {
              const response = await api.get('/usuarios');
              setUsers(response.data);
          } catch (error) {
              console.error('Erro ao buscar usuários:', error);
              const errorMessage = error.response?.data?.mensagem || 'Ocorreu um erro ao buscar os usuários.';
              toast.error(errorMessage);
          } finally {
              setLoading(false);
          }
      }
      fetchUsuarios();
  }, []);

  if (loading) {
      return <p>Carregando usuários...</p>;
  }

  return (
      <div className='lista-container'>
          <h1>Lista de Usuários</h1>
          {users.length === 0 ? (
              <p>Nenhum usuário encontrado.</p>
          ) : (
              <ul>
                  {users.map((user) => (
                      <li key={user.id}>
                          <p><strong>Nome:</strong> {user.nome}</p>
                          <p><strong>E-mail:</strong> {user.email}</p>
                      </li>
                  ))}
              </ul>
          )}
      </div>
  );
}