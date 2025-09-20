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
                    <div className="flex justify-between items-center mb-1">
                        <h2 className="text-lg font-semibold"><input
                            type="text"
                            placeholder="Search panels..."
                            className="px-3 py-2 border border-gray-300 rounded-lg w-64 focus:outline-none focus:ring-2 focus:ring-blue-400"
                            />
                        </h2>
                        <Link to={"/panel/add"}>
                            <Button primary={true} text="Add Panel"/>
                        </Link>
                    </div>
                    <PaginatedTable dataList={panels}/>
                </div>
            </main>
        </>
    );
}