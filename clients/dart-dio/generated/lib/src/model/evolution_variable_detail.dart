//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:openapi/src/model/evolution_variable_name.dart';
import 'package:openapi/src/model/evolution_variable_description.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'evolution_variable_detail.g.dart';

/// EvolutionVariableDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [symbol] - The symbol used for this variable in evolution condition expressions.
/// * [dataType] - The data type of this variable.
/// * [source_] - The source of the variable value.
/// * [versionGroup] - The version group in which this variable was introduced.
/// * [names] - The name of this resource listed in different languages.
/// * [descriptions] - The description of this resource listed in different languages.
@BuiltValue()
abstract class EvolutionVariableDetail implements Built<EvolutionVariableDetail, EvolutionVariableDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The symbol used for this variable in evolution condition expressions.
  @BuiltValueField(wireName: r'symbol')
  String get symbol;

  /// The data type of this variable.
  @BuiltValueField(wireName: r'data_type')
  String? get dataType;

  /// The source of the variable value.
  @BuiltValueField(wireName: r'source')
  String? get source_;

  /// The version group in which this variable was introduced.
  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  /// The name of this resource listed in different languages.
  @BuiltValueField(wireName: r'names')
  BuiltList<EvolutionVariableName> get names;

  /// The description of this resource listed in different languages.
  @BuiltValueField(wireName: r'descriptions')
  BuiltList<EvolutionVariableDescription> get descriptions;

  EvolutionVariableDetail._();

  factory EvolutionVariableDetail([void updates(EvolutionVariableDetailBuilder b)]) = _$EvolutionVariableDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EvolutionVariableDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EvolutionVariableDetail> get serializer => _$EvolutionVariableDetailSerializer();
}

class _$EvolutionVariableDetailSerializer implements PrimitiveSerializer<EvolutionVariableDetail> {
  @override
  final Iterable<Type> types = const [EvolutionVariableDetail, _$EvolutionVariableDetail];

  @override
  final String wireName = r'EvolutionVariableDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EvolutionVariableDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'symbol';
    yield serializers.serialize(
      object.symbol,
      specifiedType: const FullType(String),
    );
    if (object.dataType != null) {
      yield r'data_type';
      yield serializers.serialize(
        object.dataType,
        specifiedType: const FullType(String),
      );
    }
    if (object.source_ != null) {
      yield r'source';
      yield serializers.serialize(
        object.source_,
        specifiedType: const FullType(String),
      );
    }
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(VersionGroupSummary),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(EvolutionVariableName)]),
    );
    yield r'descriptions';
    yield serializers.serialize(
      object.descriptions,
      specifiedType: const FullType(BuiltList, [FullType(EvolutionVariableDescription)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EvolutionVariableDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EvolutionVariableDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'symbol':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.symbol = valueDes;
          break;
        case r'data_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.dataType = valueDes;
          break;
        case r'source':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.source_ = valueDes;
          break;
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionGroupSummary),
          ) as VersionGroupSummary;
          result.versionGroup.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EvolutionVariableName)]),
          ) as BuiltList<EvolutionVariableName>;
          result.names.replace(valueDes);
          break;
        case r'descriptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EvolutionVariableDescription)]),
          ) as BuiltList<EvolutionVariableDescription>;
          result.descriptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EvolutionVariableDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EvolutionVariableDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


