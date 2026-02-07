#tag Class
Protected Class PokemonFormDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		order As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		form_order As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		is_default As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		is_battle_only As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		is_mega As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		form_name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		pokemon As OpenAPIClient.Models.PokemonSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		sprites As PokemonFormDetailSprites
	#tag EndProperty


	#tag Property, Flags = &h0
		version_group As OpenAPIClient.Models.VersionGroupSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		form_names() As OpenAPIClient.Models.PokemonFormDetailFormNamesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		names() As OpenAPIClient.Models.PokemonFormDetailFormNamesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		types() As OpenAPIClient.Models.PokemonDetailTypesInner
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
			Name="form_order"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_default"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_battle_only"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_mega"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="form_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokemon"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sprites"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonFormDetailSprites"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_group"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VersionGroupSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="form_names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonFormDetailFormNamesInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonFormDetailFormNamesInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonDetailTypesInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


