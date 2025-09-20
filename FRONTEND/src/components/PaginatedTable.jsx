import { useState } from "react";

export default function PaginatedTable() {
  // Sample data
  const data = [
    { id: 1, name: "Laptop", price: "₹60,000" },
    { id: 2, name: "Phone", price: "₹25,000" },
    { id: 3, name: "Tablet", price: "₹30,000" },
    { id: 4, name: "Headphones", price: "₹5,000" },
    { id: 5, name: "Keyboard", price: "₹2,000" },
    { id: 6, name: "Mouse", price: "₹1,500" },
    { id: 7, name: "Monitor", price: "₹15,000" },
    { id: 8, name: "Printer", price: "₹10,000" },
    { id: 9, name: "Camera", price: "₹40,000" },
  ];

  // Pagination state
  const [currentPage, setCurrentPage] = useState(1);
  const rowsPerPage = 3;

  // Pagination logic
  const indexOfLastRow = currentPage * rowsPerPage;
  const indexOfFirstRow = indexOfLastRow - rowsPerPage;
  const currentRows = data.slice(indexOfFirstRow, indexOfLastRow);

  const totalPages = Math.ceil(data.length / rowsPerPage);

  return (
    <div className="pt-4">
      <div className="overflow-x-auto">
        <table className="min-w-full border border-gray-200 rounded-lg">
            <thead className="bg-blue-800 text-white">
            <tr>
                <th className="px-4 py-2 text-left">Name</th>
                <th className="px-4 py-2 text-left">Email</th>
                <th className="px-4 py-2 text-left">Level</th>
                <th className="px-4 py-2 text-left">Skills</th>
                <th className="px-4 py-2 text-left">Current Location</th>
                <th className="px-4 py-2 text-left">Experience</th>
                <th className="px-4 py-2 text-left">Cand Exp Upto</th>
                <th className="px-4 py-2 text-left"></th>
            </tr>
            </thead>
            <tbody>
            <tr className="odd:bg-white even:bg-gray-50">
                <td className="px-4 py-2">Laptop</td>
                <td className="px-4 py-2">₹60,000</td>
                <td className="px-4 py-2">25</td>
                <td className="px-4 py-2">25</td>
                <td className="px-4 py-2">25</td>
                <td className="px-4 py-2">25</td>
                <td className="px-4 py-2">25</td>
            </tr>
            </tbody>
        </table>
      </div>  

      <div className="flex justify-center mt-4 space-x-2">
        <button
          className="px-3 py-1 border rounded disabled:opacity-50"
          onClick={() => setCurrentPage((prev) => Math.max(prev - 1, 1))}
          disabled={currentPage === 1}
        >
          Prev
        </button>

        {Array.from({ length: totalPages }, (_, i) => (
          <button
            key={i + 1}
            className={`px-3 py-1 border rounded ${
              currentPage === i + 1
                ? "bg-blue-500 text-white"
                : "hover:bg-gray-100"
            }`}
            onClick={() => setCurrentPage(i + 1)}
          >
            {i + 1}
          </button>
        ))}

        <button
          className="px-3 py-1 border rounded disabled:opacity-50"
          onClick={() =>
            setCurrentPage((prev) => Math.min(prev + 1, totalPages))
          }
          disabled={currentPage === totalPages}
        >
          Next
        </button>
      </div>
    </div>
  );
}
