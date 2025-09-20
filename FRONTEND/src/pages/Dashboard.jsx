import { Link } from "react-router-dom";
import { Header } from "../components/Header";
import {PaginatedTable} from "../components/PaginatedTable";
import { Button } from "../components/Button";
import { useEffect, useState } from "react";
import { getAllPanels } from "../service/PanelService";

export const Dashboard = () => {

    const [panels, setPanels] = useState([]);

    async function fetchPanels(){
        const allPanels = await getAllPanels();
        console.log(allPanels);
        setPanels(allPanels)
    }

    useEffect(() => {
        fetchPanels();
    }, []);

    return (
        <>
            <Header />
            <main>
                <div className="mx-auto max-w-7xl px-4 py-6 sm:px-6 lg:px-8">
                    <PaginatedTable dataList={panels} buttonText={"Add Panel"} searchPlaceholder={"Search Panels..."}/>
                </div>
            </main>
        </>
    );
}