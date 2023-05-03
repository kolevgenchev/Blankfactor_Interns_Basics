using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Task4
{
    public abstract class BaseCar
    {
        protected BaseCar(BaseModel baseModel, BaseEngine baseEngine, BaseCargo baseCargo)
        {
            this.Model = baseModel;
            this.Engine = baseEngine;
            this.Cargo = baseCargo;
            this.Tires = new List<BaseTire>();
        }

        public BaseModel Model { get; set; }
        public BaseEngine Engine { get; set; }
        public BaseCargo Cargo { get; set; }
        public ICollection<BaseTire> Tires { get; set; }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();

            sb.AppendLine($"{this.Model.Name} with EnginePower -> {this.Engine.EnginePower} EngineSpeed -> {this.Engine.EngineSpeed} Cargo -> {this.Cargo.CargoType} CargoWeight {this.Cargo.CargoWeight:F2} TiresPresure -> {string.Join(",",this.Tires.Select(x => x.Pressure))} TiresAge -> {string.Join(",", this.Tires.Select(x => x.Age))}");

            return sb.ToString().Trim();
        }
    }
}
