import { Route, Router } from "react-router-dom"
import { Dashboard } from "../pages/Dashboard"
import { AddPanel } from "../pages/AddPanel"

export const InterviewRoutes = () => {
    <Router>
        <Route path="" exact Component={<Dashboard />}></Route>
        <Route path="/" exact Component={<Dashboard />}></Route>
        <Route path="/panel" Component={<Dashboard />}></Route>
        <Route path="/panel/add" Component={<AddPanel />}></Route>
    </Router>
}