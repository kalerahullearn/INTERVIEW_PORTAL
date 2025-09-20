import { Route, Routes } from "react-router-dom"
import { Dashboard } from "../pages/Dashboard"
import { AddPanel } from "../pages/AddPanel"

export const InterviewRoutes = () => {
   return (
     <Routes>
        <Route path="/" element={<Dashboard />} />
        <Route path="/panel" element={<Dashboard />}></Route>
        <Route path="/panel/add" element={<AddPanel />}></Route>
    </Routes>
   );
}