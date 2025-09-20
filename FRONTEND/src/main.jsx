import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import { BrowserRouter } from 'react-router-dom'
import {InterviewRoutes} from "./components/InterviewRoutes";

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <BrowserRouter>
      <InterviewRoutes />
    </BrowserRouter>
  </StrictMode>
)
