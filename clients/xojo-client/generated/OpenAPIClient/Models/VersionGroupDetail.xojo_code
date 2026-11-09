#tag Class
Protected Class VersionGroupDetail

	#tag Property, Flags = &h0
		#tag Note
			The identifier for this resource.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name for this resource.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Order for sorting. Almost by date of release, except similar versions are grouped together.
		#tag EndNote
		order As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The generation this version was introduced in.
		#tag EndNote
		generation As OpenAPIClient.Models.GenerationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of methods in which Pokémon can learn moves in this version group.
		#tag EndNote
		move_learn_methods() As OpenAPIClient.Models.MoveLearnMethodSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of Pokédexes introduces in this version group.
		#tag EndNote
		pokedexes() As OpenAPIClient.Models.PokedexSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of regions that can be visited in this version group.
		#tag EndNote
		regions() As OpenAPIClient.Models.RegionSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The versions this version group owns.
		#tag EndNote
		versions() As OpenAPIClient.Models.VersionSummary
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="order"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="generation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GenerationSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="move_learn_methods"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveLearnMethodSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokedexes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokedexSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="regions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RegionSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="versions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VersionSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


